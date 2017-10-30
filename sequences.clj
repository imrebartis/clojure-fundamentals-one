(seq [1 2 3])
;=> (1 2 3) ; not a list

(first (seq [1 2 3]))
;=> 1

(rest (seq [1 2 3]))
;=> (2 3)

(cons 1 (rest (seq [1 2 3])))
;=> (1 2 3)

(first [1 2 3])
;=> 1

(rest [1 2 3])
;=> (2 3)

(cons 1 [2 3])
;=> (1 2 3)

; generating sequences:
(seq [1 2 3]) ;=> (1 2 3) ; not a list
(range) ; => (0 1 2 ... infinite
(range 3); => (0 1 2)
(range 1 7 2) ; => (1 3 5)
(iterate #(* 2 %) 2) ; (2 4 8 16 ... infinite
(re-seq #"[aeiou]" "clojure") ;=> ("o" "u" "e")


; seq in, seq out
(take 3 (range)) ; => (0 1 2)
(drop 3 (range)) ;=> (3 4 5 ... infinite
(map #(* % %) [0 1 2 3]) ;=> ((0 1 4 9)
(filter even? (range)) ; => (0 2 4 6 ... infinite
(apply str (interpose "," (range 3))) ;=> "0,1,2"

; using a seq
(reduce + (range 4)) ; => 6
(reduce + 10 (range 4)) => 16
(into #{} "hello") ; #{\e \h \l \o}
(into {} [[:x 1] [:y 2]]) ; {:x 1, :y 2}
(some {2 :b 3 :c} [1 nil 2 3]) ; :b


