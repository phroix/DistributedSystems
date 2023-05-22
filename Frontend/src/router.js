import Vue from "vue";
import Router from "vue-router";

Vue.use(Router);

export default new Router({
  mode: "history",
  routes: [
    {
      path: "/",
      alias: "/posts",
      name: "posts",
      component: () => import("./components/PostsList"), //TutorialsList
    },
    {
      path: "/posts/:id",
      name: "posts-details",
      component: () => import("./components/Post"), //Tutorial
    },
    {
      path: "/add",
      name: "add",
      component: () => import("./components/AddPost"), //AddTutorial
    },
  ],
});
