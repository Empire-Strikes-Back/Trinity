#!/bin/bash

shadow(){
    ./node_modules/.bin/shadow-cljs "$@"
}

release(){
    npm i
    rm -rf resources/public/out resources/public/manifest.json 
    shadow -A:shadow:core:prod release ext
}

dev(){
    npm i
    shadow -A:shadow:core:dev watch ext
}

"$@"