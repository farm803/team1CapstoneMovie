<template>

    <v-data-table
        :headers="headers"
        :items="serarchMovie"
        :items-per-page="5"
        class="elevation-1"
    ></v-data-table>

</template>

<script>
    const axios = require('axios').default;

    export default {
        name: 'SerarchMovieView',
        props: {
            value: Object,
            editMode: Boolean,
            isNew: Boolean
        },
        data: () => ({
            headers: [
                { text: "id", value: "id" },
            ],
            serarchMovie : [],
        }),
          async created() {
            var temp = await axios.get(axios.fixUrl('/serarchMovies'))

            temp.data._embedded.serarchMovies.map(obj => obj.id=obj._links.self.href.split("/")[obj._links.self.href.split("/").length - 1])

            this.serarchMovie = temp.data._embedded.serarchMovies;
        },
        methods: {
        }
    }
</script>

