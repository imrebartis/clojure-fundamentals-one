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

