(ns namespaces-example

  (:require [clojure.set :as s])
  (:use [clojure.java.io :only (delete-file)]))

(join "," ["a" "b"]

; => "a,b"

(s/union #{1 2} #{3 4})
; => {1 2 3 4}

(defn do-union [& sets]
    (apply s/union sets))

(do-union #{1} #{1 2 3})
 ; => {1 2 3}

(defn delete-old-files [& files]
  (doseq [f files]
    (delete-file f)))


