<template>
  <div v-if="currentPost" class="edit-form">
    <h4>Post</h4>
    <form>
      <div class="form-group">
        <label for="name">Name</label>
        <input
          type="text"
          class="form-control"
          id="name"
          v-model="currentPost.name"
        />
      </div>
      <div class="form-group">
        <label for="textPost">Post</label>
        <input
          type="text"
          class="form-control"
          id="textPost"
          v-model="currentPost.textPost"
        />
      </div>
    </form>

    <button class="badge badge-danger mr-2" @click="deletePost">
      Delete
    </button>

    <button type="submit" class="badge badge-success" @click="updatePost">
      Update
    </button>
    <p>{{ message }}</p>
  </div>

  <div v-else>
    <br />
    <p>Please click on a Post</p>
  </div>
</template>

<script>
import PostDataService from "../services/PostDataService";

export default {
  name: "post",
  data() {
    return {
      currentPost: null,
      message: "",
    };
  },
  methods: {
    getPost(id) {
      PostDataService.get(id)
        .then((response) => {
          this.currentPost = response.data;
          console.log(response.data);
        })
        .catch((e) => {
          console.log(e);
        });
    },

    updatePost() {
      PostDataService.update(this.currentPost.id, this.currentPost)
        .then((response) => {
          console.log(response.data);
          this.message = "The post was updated successfully!";
        })
        .catch((e) => {
          console.log(e);
        });
    },

    deletePost() {
      PostDataService.delete(this.currentPost.id)
        .then((response) => {
          console.log(response.data);
          this.$router.push({ name: "posts" });
        })
        .catch((e) => {
          console.log(e);
        });
    },
  },
  mounted() {
    this.message = "";
    this.getPost(this.$route.params.id);
  },
};
</script>

<style>
.edit-form {
  max-width: 300px;
  margin: auto;
}
</style>
