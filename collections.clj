; lists:
(list 1 2 3)
(quote (1 2 3))
'(1 2 3)
(conj '(2 3) 1) ;=> (1 2 3)

; vectors:
[1 2 3]
(vector 1 2 3)
(vec '(1 2 3))
(nth [1 2 3] 0) ; => 1
(conj [1 2] 3)
'[1 2 (+1 2)] ; => [1 2 (+1 2)]

;vectors and lists:
(def lst
  '(1 2))

lst ; => (1 2)

(vec lst) ; => [1 2]

lst ; => (1 2)

(nth (vec lst) 0) ; => 2

(conj [1 2] 3) ; => [1 2 3]
(conj '(1 2) 3) ; => (3 1 2)
