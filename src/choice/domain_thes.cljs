(ns choice.domain-thes
  (:require [goog.dom :as dom]
            [goog.style :as style]
            [choice.core :refer [set-display select-element]]))

(def -conf
  {;top ad
   :thes.element.selector/top-ad ".css-1xdhyk6" #_"#thesaurus_serp_atf_728x90"
   ; right ad
   :thes.element.selector/right-ad ".css-jj611e" #_"#thesaurus_serp_atf_300x250"})

(comment


  (select-element (-conf :thes.element.selector/right-ad))
  (js/document.querySelector "#thesaurus_serp_atf_300x250")
  (js/document.querySelector ".css-jj611e")

  

  (set-display (-conf :thes.element.selector/top-ad) "none")
  (set-display (-conf :thes.element.selector/top-ad) "initial")
  (set-display (-conf :thes.element.selector/right-ad) "none")
  (set-display (-conf :thes.element.selector/right-ad) "initial")

  ;
  )



(defn mount
  []
  (do
    (set-display (-conf :thes.element.selector/top-ad) "none")
    (set-display (-conf :thes.element.selector/right-ad) "none")
    ))

(defn unmount
  []
  (prn "unmounted"))

