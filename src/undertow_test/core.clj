(ns undertow-test.core
  (:require
   [kit.config :as config]
   [integrant.core :as ig]
   [kit.edge.server.undertow]
   [integrant.repl :refer [clear go halt prep init reset reset-all]]))

(def ^:const system-filename "system.edn")

(defonce system (atom nil))

(defmethod ig/init-key :handler/ring
  [_ _]
  (fn [request]
    {:status 200
     :body (pr-str request)
     :headers {"Content-Type" "text/plain"}}))

(defn start []
  (->> (config/read-config system-filename {})
       (ig/prep)
       (ig/init)
       (reset! system))
  (integrant.repl/set-prep! start))

  (defn -main []
    (start))
