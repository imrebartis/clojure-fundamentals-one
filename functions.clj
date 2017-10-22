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


; closures
(defn messenger-builder [greeting]
  (fn [who] (print greeting who))) ; fn closes over greeting

; greeting provided here, then goes out of scope
(def hello-er (messenger-builder "Hello"))

; greeting still available 'coz hello-er is closure
(hello-er "world!")
; Hello world!

