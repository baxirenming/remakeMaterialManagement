<template>
  <div class="home">
    <h1>Home</h1>
    <ul>
      <li v-for="entity in entities" :key="entity.id">{{ entity.name }}</li>
    </ul>
  </div>
</template>

<script>
export default {
  data() {
    return {
      entities: [],
    };
  },
  created() {
    fetch("/api/entities")
      .then((response) => response.json())
      .then((data) => {
        this.entities = data;
      });
  },
};
</script>

<style scoped>
.home {
  padding: 20px;
}
</style>
