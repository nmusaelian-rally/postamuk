(defproject postamuk "0.1.0-SNAPSHOT"
  :description "FIXME: write description"
  :url "http://example.com/FIXME"
  :license {:name "Eclipse Public License"
            :url "http://www.eclipse.org/legal/epl-v10.html"}
  :dependencies [[org.clojure/clojure "1.8.0"]
                 [clj-http "3.9.1" :exclusions [cheshire]]  ;3.4.1, 3.6.1, 3.7.0, 3.8.0, 3.9.0 - error with async true; 3.10.0 is not found
                 [cheshire "5.8.1"]]
  :main ^:skip-aot postamuk.core
  :target-path "target/%s"
  :profiles {:uberjar {:aot :all}})
