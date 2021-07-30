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

push(){
  ORIGIN=$(git remote get-url origin)
  rm -rf .git
  git init -b main
  git remote add origin $ORIGIN
  git config --local include.path ../.gitconfig
  git add .
  git commit -m "i am choice program"
  git push -f -u origin main
}

"$@"