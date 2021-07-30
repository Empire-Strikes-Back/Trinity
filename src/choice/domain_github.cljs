(ns choice.domain-github
  (:require [goog.dom :as dom]
            [goog.style :as style]
            [choice.core :refer [set-display select-element inject-style]]))


(def -conf
  {;recent activity
   :github.element.id/dashboard "dashboard"
   :github.element.selector/dashboard "#dashboard"
   ; explore panel (whole right side )
   :github.element.selector/explore "[aria-label=\"Explore\"]"})

(comment

  (js/console.log 3)

  (dom/getElement "body")
  (-> (dom/getElementsByTagName "body") (js/console.log))
  (def el (-> (dom/getElementsByTagName "body") (aget 0)))
  (style/setStyle el #js {:display "none"})
  (style/setStyle el #js {:display "initial"})
  (js/console.log #js {:display "none"})

  (def dashboard (dom/getElement (-conf :github.element.id/dashboard)))
  (style/setStyle dashboard #js {:display "initial"})
  (style/setStyle dashboard #js {:display "none"})

  (def aside-nodes (dom/getElementsByTagName "aside" ))
  (.-length aside-nodes)
  (def aside (aget aside-nodes 2))
  (def aside (dom/getElementByTagNameAndClass "aside" "pr-3"))
  (def aside (js/document.querySelector "[aria-label=\"Explore\"]"))
  (js/document.querySelector "#dashboard")
  (set! (.. js/window -d) 4)
  (style/setStyle aside #js {:display "initial"})
  (style/setStyle aside #js {:display "none"})
  
  (def sheet "
    *[aria-label=\"Explore\"] {
        display: none;
      }
    ")
  
  (inject-style sheet)
  
  js/document.title

  ;
  )

#_(set-display (-conf :github.element.selector/dashboard) "initial")
#_(set-display (-conf :github.element.selector/explore) "initial")

(def sheet "
  
    *[aria-label=\"Explore\"] {
        display: none;
      }
  
    #dashboard {
       display: none;
    }
    .js-yearly-contributions {
            display: none;
    }
  
    ")

(defn mount
  []
  (do
    (inject-style sheet)
    #_(set-display (-conf :github.element.selector/dashboard) "none")
    #_(set-display (-conf :github.element.selector/explore) "none")))

(defn unmount
  []
  (prn "unmounted"))

