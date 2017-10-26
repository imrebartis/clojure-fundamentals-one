; lists:

(list 1 2 3)
'(1 2 3)
(conj '(2 3) 1) ;=> (1 2 3)

; vectors:
[1 2 3]
(vector 1 2 3)
(vec '(1 2 3))
(nth [1 2 3] 0) ; => 1
(conj [1 2] 3)
