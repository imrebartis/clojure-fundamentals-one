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
