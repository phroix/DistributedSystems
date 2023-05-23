<template>
  <div id="app">
    <nav class="navbar navbar-expand navbar-blue bg-dark">
      <router-link to="/" class="navbar-brand">Phileas Roth Blog</router-link>
      <div class="navbar-nav mr-auto">
        <li class="nav-item">
          <router-link to="/posts" class="nav-link">Blog</router-link>
        </li>
        <li class="nav-item">
          <router-link to="/add" class="nav-link">Add</router-link>
        </li>
      </div>
    </nav>

    <div class="container mt-3">
      <router-view />
    </div>
  </div>
</template>

<script>
export default {
  name: "app"
};
</script>
