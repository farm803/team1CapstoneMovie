
import Vue from 'vue'
import Router from 'vue-router'

Vue.use(Router);


import MessageManager from "./components/listers/MessageCards"
import MessageDetail from "./components/listers/MessageDetail"

import ReservationManager from "./components/listers/ReservationCards"
import ReservationDetail from "./components/listers/ReservationDetail"

import SerarchMovieView from "./components/SerarchMovieView"
import SerarchMovieViewDetail from "./components/SerarchMovieViewDetail"
import SearchReservationView from "./components/SearchReservationView"
import SearchReservationViewDetail from "./components/SearchReservationViewDetail"
import MovieManager from "./components/listers/MovieCards"
import MovieDetail from "./components/listers/MovieDetail"

import PaymentManager from "./components/listers/PaymentCards"
import PaymentDetail from "./components/listers/PaymentDetail"


import MyPageView from "./components/MyPageView"
import MyPageViewDetail from "./components/MyPageViewDetail"

export default new Router({
    // mode: 'history',
    base: process.env.BASE_URL,
    routes: [
            {
                path: '/messages',
                name: 'MessageManager',
                component: MessageManager
            },
            {
                path: '/messages/:id',
                name: 'MessageDetail',
                component: MessageDetail
            },

            {
                path: '/reservations',
                name: 'ReservationManager',
                component: ReservationManager
            },
            {
                path: '/reservations/:id',
                name: 'ReservationDetail',
                component: ReservationDetail
            },

            {
                path: '/serarchMovies',
                name: 'SerarchMovieView',
                component: SerarchMovieView
            },
            {
                path: '/serarchMovies/:id',
                name: 'SerarchMovieViewDetail',
                component: SerarchMovieViewDetail
            },
            {
                path: '/searchReservations',
                name: 'SearchReservationView',
                component: SearchReservationView
            },
            {
                path: '/searchReservations/:id',
                name: 'SearchReservationViewDetail',
                component: SearchReservationViewDetail
            },
            {
                path: '/movies',
                name: 'MovieManager',
                component: MovieManager
            },
            {
                path: '/movies/:id',
                name: 'MovieDetail',
                component: MovieDetail
            },

            {
                path: '/payments',
                name: 'PaymentManager',
                component: PaymentManager
            },
            {
                path: '/payments/:id',
                name: 'PaymentDetail',
                component: PaymentDetail
            },


            {
                path: '/myPages',
                name: 'MyPageView',
                component: MyPageView
            },
            {
                path: '/myPages/:id',
                name: 'MyPageViewDetail',
                component: MyPageViewDetail
            },


    ]
})
