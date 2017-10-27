(def stuff [7 8 9 10 11])

(let [[a b c] stuff]
  (list (+ a b) (+ b c)))
; => (15 17)
(let [[a b c d e f] stuff]
  (list d e f))
; => (10 11 nil)
