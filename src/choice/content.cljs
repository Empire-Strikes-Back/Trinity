(ns choice.content
  (:require [goog.uri.utils  :refer [getDomain]]
            [choice.domain-github :as github]
            [choice.domain-thes :as thes]
            [choice.domain-youtube :as youtube]
            [choice.domain-google :as google]))

(defn mount
  []
  (when (= "github.com" (getDomain js/location.href))
    (do
      (github/mount)
      #_(prn "mounted github")))

  (when (= "www.youtube.com" (getDomain js/location.href))
    (do
      (youtube/mount)
      #_(prn "mounted youtube")))

  (when (= "www.thesaurus.com" (getDomain js/location.href))
    (do
      (thes/mount)
      #_(prn "mounted thesaurus")))

  (when (= "www.google.com" (getDomain js/location.href))
    (do
      (google/mount)
      #_(prn "mounted google"))))

(defn main
  []
  #_(prn "choice.content.main")
  #_(prn "domain is " (getDomain js/location.href))
  (mount))

(comment

  (prn )
  
  js/location.host
  

  (getDomain js/location.href)
  
  ;
  )
