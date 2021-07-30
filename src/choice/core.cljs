(ns choice.core
  (:require [goog.dom :as dom]
            [goog.style :as style]))

(defn select-element
  [v]
  (js/document.querySelector v))

(defn set-element-display
  [el v]
  (style/setStyle el #js {:display v}))

(defn set-display
  [selector v]
  (some->
   (select-element selector)
   (set-element-display v)))

(comment
  
  (def el (dom/createElement "style"))
  (.. el -type)
  
  ;
  )

(defn inject-style
  [style-str]
  (let [el (dom/createElement "style")
        parent (-> (dom/getElementsByTagName "body") (aget 0))]
    (do
      (set! (.. el -type) "text/css")
      (set! (.. el -innerHTML ) style-str)
      (.appendChild parent el))))