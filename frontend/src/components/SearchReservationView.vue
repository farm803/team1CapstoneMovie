<template>

    <v-data-table
        :headers="headers"
        :items="searchReservation"
        :items-per-page="5"
        class="elevation-1"
    ></v-data-table>

</template>

<script>
    const axios = require('axios').default;

    export default {
        name: 'SearchReservationView',
        props: {
            value: Object,
            editMode: Boolean,
            isNew: Boolean
        },
        data: () => ({
            headers: [
                { text: "id", value: "id" },
            ],
            searchReservation : [],
        }),
          async created() {
            var temp = await axios.get(axios.fixUrl('/searchReservations'))

            temp.data._embedded.searchReservations.map(obj => obj.id=obj._links.self.href.split("/")[obj._links.self.href.split("/").length - 1])

            this.searchReservation = temp.data._embedded.searchReservations;
        },
        methods: {
        }
    }
</script>

