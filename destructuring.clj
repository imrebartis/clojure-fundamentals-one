(def stuff [7 8 9 10 11])

(comment
(let [[a b c] stuff]
  (list (+ a b) (+ b c)))
; => (15 17)
(let [[a b c d e f] stuff]
  (list d e f))
; => (10 11 nil)
)

(let [[a & others] stuff]
  (println a) ; => 7
  (println others)) ; => (8 9 10 11)


; sequential destructuring:

(let [[_ & others] stuff] ; skip the first one
  (println others)); => (8 9 10 11)


(def names ["Bob" "Sally" "Joe"])
(let [[first-name] names] first-name)
; => "Bob"
(let [[_ second-name] names] second-name)
; => "Sally"
(let [[_ & rest-names] names] rest-names)
; => ("Sally" "Joe")


(let [[_ & rest-names] names] _)
; => "Bob"

(defn rest_names [[_ & rest-names]]
  rest-names)


; associative destructuring:

(def m {:a 7 :b 4})
(let [{a :a, b :b} m]
  [a b]) ; => [7 4]

(def n {:a 8 :b 12})
(let [{:keys [a b]} n]
  [a b]) ; => [8 12]
(let [{:keys [a b c]} n]
  [a b c]) ; => [8 12 nil]

; using 'or' to provide default values:
(let [ {:keys [a b c]
        :or {c 3}} n]
  [a b c]) ; => [8 12 3]

