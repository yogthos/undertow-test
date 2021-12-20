(defproject undertow-test "0.1.0-SNAPSHOT"
  :description "FIXME: write description"
  :url "http://example.com/FIXME"
  :license {:name "EPL-2.0 OR GPL-2.0-or-later WITH Classpath-exception-2.0"
            :url "https://www.eclipse.org/legal/epl-2.0/"}
  :dependencies [[org.clojure/clojure "1.10.3"]
                 [ring/ring-core "1.9.3"]
                 [kit-clj/kit-undertow "1.0.0"]
                 [integrant "0.8.0"]
                 [kit-clj/kit-core "1.0.0"]
                 [integrant/repl "0.3.2"]]
  :main undertow-test.core
  :repl-options {:init-ns undertow-test.core})
