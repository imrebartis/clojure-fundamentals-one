; MULTI-ARITY:

(defn messenger
  ; no args, call self with default msg
  ([] (messenger "Hello wind!"))
  ; one arg, print it
  ([msg] (print msg)))

(messenger)
; => "Hello wind!"

(messenger "Hi sun!")
; => "Hi sun!"

; variadic function (the param after '&' collects
; all remaining args:

(defn messenger [greeting & who]
  (print greeting  who))

(messenger "Hi" "you" "little")
; => Hi (you little)

; apply
(let [a 1
      b 2
      more '(3 4)]
  (apply print a b more))
; => 1 2 3 4

; & puts rest of args into a sequence
(defn messenger [greeting & who]
  ; apply gets rest of args out of the sequence
  (apply print greeting who))

(messenger "hi" "ho" "hee")
; => hi ho hee

(defn messenger2 [greeting & who]
  ; apply gets rest of args out of the sequence
  (apply print who))

(messenger2 "hi" "ho" "hee")
; => ho hee

(let [numbers '(1 2 3)]
     (apply + numbers))
; => 6

