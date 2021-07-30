(ns choice.action
  (:require [goog.dom :as dom])
  )

(defn main
  []
  (do (set! (.. (js/document.querySelector "#app") -innerHTML) "hello world"))
  #_(js/alert "hi") ; works
  (prn "choice.action.main"))
