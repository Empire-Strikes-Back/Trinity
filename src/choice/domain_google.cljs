(ns choice.domain-google
  (:require [goog.dom :as dom]
            [goog.style :as style]
            [choice.core :refer [set-display select-element]]))

(def -conf
  {;top ad
   :google.element.selector/doodle "#hplogo"})

(comment


  (select-element (-conf :google.element.selector/doodle))
  (js/document.querySelector "#hplogo")

  (set-display (-conf :google.element.selector/doodle) "none")
  (set-display (-conf :google.element.selector/doodle) "initial")

  ;
  )

(defn mount
  []
  (do
    (set-display (-conf :google.element.selector/doodle) "none")))

(defn unmount
  []
  (prn "unmounted"))

