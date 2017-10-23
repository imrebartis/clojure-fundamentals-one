;require

(require '[clojure.set :as s])
(s/union #{1 2} #{2 3 4})
; => #{1 2 3 4}

(s/union #{:a :b} #{:c :d})
; => #{:a :c :b :d}
