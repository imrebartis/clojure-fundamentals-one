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


; maps:
{:a 1 :b 2}
(:a {:a 1 :b 2})
({:a 1 :b 2} :a)
(assoc {:a 1} :b 2) ; => {:a 1, :b 2}
(dissoc {:a 1} :a) ; => {}
(conj {} [:a 1]) ; => {:a 1}

;nested maps:

(def jdoe {:name "Jox", :address {:zip 27705}})

(get-in jdoe [:address :zip])

(get jdoe :age 21) ; => 21

(assoc-in jdoe [:address :zip] 27514)

(update-in jdoe [:address :zip] inc)

(get-in jdoe [:address :suite] "Ste. 2")
; => "Ste. 2"


; sets:
#{:a :b}
(#{:a :b} :a)
(conj #{} :a)
(contains? #{:a} :a)

(require '[clojure.set :as set])
(set/union #{:a} #{:b}) ; => #{:b :a}
(set/difference #{:a :b} #{:a}) ; => #{:b}
(set/intersection #{:a :b} #{:b :c}) ; => #{:b}
