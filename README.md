# DEPRECATED

Deprecated as Openshift V2 is stopped. You can try [deploy to Heroku](https://github.com/pengrad/telegram-bot-heroku)

## Template to deploy [Telegram Bots](https://core.telegram.org/bots/) on [OpenShift](https://www.openshift.com) platform with [java-telegram-bot-api](https://github.com/pengrad/java-telegram-bot-api)

To get started we need to install client tools and set up machine  
https://developers.openshift.com/en/getting-started-osx.html

#### Create app on OpenShift
- Create app from web UI  
https://openshift.redhat.com/app/console/application_type/cart!diy-0.1  
`Source code` must be filled with `https://github.com/pengrad/java-telegram-openshift` and `master`

- Create app from console  
`rhc app create MyTestApp diy-0.1 --from-code https://github.com/pengrad/java-telegram-openshift`
