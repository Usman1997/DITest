package com.example.core.di

class DaggerWrapper {

    companion object {
        private var component: RootComponent? = null

        public fun getComponent(): RootComponent {
            if (component == null) {
                initComponent()
            }
            return component!!
        }

        public fun initComponent() {
            component = DaggerRootComponent
                .create()
        }

    }
}