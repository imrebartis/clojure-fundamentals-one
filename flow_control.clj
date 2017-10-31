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


