<template>
  <div class="submit-form">
    <div v-if="!submitted">
      <div class="form-group">
        <label for="name">Name</label>
        <input
          type="text"
          class="form-control"
          id="name"
          required
          v-model="post.name"
          name="name"
        />
      </div>

      <div class="form-group">
        <label for="textPost">Post</label>
        <input
          class="form-control"
          id="textPost"
          required
          v-model="post.textPost"
          name="textPost"
        />
      </div>

      <button @click="savePost" class="btn btn-success">Submit</button>
    </div>

    <div v-else>
      <h4>You submitted successfully!</h4>
      <button class="btn btn-success" @click="newPost">Add</button>
    </div>
  </div>
</template>

<script>
import PostDataService from "../services/PostDataService";

export default {
  name: "add-post",
  data() {
    return {
      post: {
        id: null,
        name: "",
        textPost: "",
      },
      submitted: false,
    };
  },
  methods: {
    savePost() {
      var data = {
        name: this.post.name,
        textPost: this.post.textPost,
      };

      PostDataService.create(data)
        .then((response) => {
          this.post.id = response.data.id;
          console.log(response.data);
          this.submitted = true;
        })
        .catch((e) => {
          console.log(e);
        });
    },

    newPost() {
      this.submitted = false;
      this.post = {};
    },
  },
};
</script>

<style>
.submit-form {
  max-width: 300px;
  margin: auto;
}
</style>
