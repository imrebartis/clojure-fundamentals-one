(if (Object.) :truthy :falsey) ; truthy
(if [] :truthy :falsey) ; truthy
(if nil :truthy :falsey) ; :falsey
(if (seq []) :truthy :falsey) ; :falsey

(str "2 is " (if (even? 2) "even" "odd"))
; => "2 is even"

; else-expression's optional:
(if (true? false) "no way!")
; => nil

(if (even? 5)
  (do (println "even")
    true)
  (do (println "odd")
    false))
; => false
;; odd

(if-let [x (even? 2)]
  (println x)
  (println "odd"))
; => true

(defn show-evens [coll]
  (if-let [evens (seq (filter even? coll))]
    (println (str "The evens are: " evens))
    (println "There were no evens.")))

(show-evens [1 2 3 4]) ;=> The evens are: (2 4)


; cond:
(let [x 5]
  (cond
    (< x 2) "x is less than 2"
    (< x 10) "x is less than 10"))
; => "x is less than 10"

(let [x 11]
  (cond
    (< x 2) "x is less than 2"
    (< x 10) "x is less than 10"
    :else "x is greater than or equal to 10"))
;=> "x is greater than or equal to 10"

(defn str-binary [n]
  (cond
    (= n 0) "zero"
    (= n 1) "one"
    :else "unknown"))
(str-binary 1)
; => "one"

; condp:
(defn foo [x]
  (condp = x
    5 "x is 5"
    10 "x is 10"
    "x isn't 5 or 10"))
(foo 11)
; => "x isn't 5 or 10"

(defn str-binary [n]
  (condp = n
    0 "zero"
    1 "one"
    "unknown"))
(str-binary 1)
; => "one"

; case:
(defn foo [x]
  (case x
    5 "x is 5"
    10 "x is 10"
    "x isn't 5 or 10"))
(foo 11)
; => "x isn't 5 or 10"

(defn str-binary [n]
  (case n
    0 "zero"
    1 "one"
    "unknown"))
(str-binary 1)
; => "one"

; doseq
(doseq [n (range 3)]
  (println n))
; 0
; 1
; 2
; => nil
