
import Vue from 'vue'
import Router from 'vue-router'

Vue.use(Router);


import MessageMessageManager from "./components/listers/MessageMessageCards"
import MessageMessageDetail from "./components/listers/MessageMessageDetail"

import AppPushApplicationManager from "./components/listers/AppPushApplicationCards"
import AppPushApplicationDetail from "./components/listers/AppPushApplicationDetail"

import SmsAgencyManager from "./components/listers/SmsAgencyCards"
import SmsAgencyDetail from "./components/listers/SmsAgencyDetail"


export default new Router({
    // mode: 'history',
    base: process.env.BASE_URL,
    routes: [
            {
                path: '/messages/messages',
                name: 'MessageMessageManager',
                component: MessageMessageManager
            },
            {
                path: '/messages/messages/:id',
                name: 'MessageMessageDetail',
                component: MessageMessageDetail
            },

            {
                path: '/appPushes/applications',
                name: 'AppPushApplicationManager',
                component: AppPushApplicationManager
            },
            {
                path: '/appPushes/applications/:id',
                name: 'AppPushApplicationDetail',
                component: AppPushApplicationDetail
            },

            {
                path: '/sms/agencies',
                name: 'SmsAgencyManager',
                component: SmsAgencyManager
            },
            {
                path: '/sms/agencies/:id',
                name: 'SmsAgencyDetail',
                component: SmsAgencyDetail
            },



    ]
})
