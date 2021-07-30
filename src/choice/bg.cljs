(ns choice.bg)

(js/chrome.runtime.onInstalled.addListener
 #(println "chrome.runtime.onInstalled choice.bg"))

(defn main
  []
  (prn "choice.bg.main"))


(defn ^:dev/before-load stop [])


(defn ^:dev/after-load start [])

