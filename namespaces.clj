;require

(require '[clojure.set :as s])
(s/union #{1 2} #{2 3 4})
; => #{1 2 3 4}

(s/union #{:a :b} #{:c :d})
; => #{:a :c :b :d}

(require 'clojure.string)
(reverse "hello")
; => "olleh"
(join ", " [1 2 3])
; => "1, 2, 3"

;use (recommended for REPL only)
(use 'clojure.java.io)

(ns-publics 'clojure.java.io)
; => {output-stream #'clojure.java.io/output-stream, copy #'clojure.java.io/copy, file #'clojure.java.io/file, writer #'clojure.java.io/writer, as-relative-path #'clojure.java.io/as-relative-path, make-output-stream #'clojure.java.io/make-output-stream, make-parents #'clojure.java.io/make-parents, reader #'clojure.java.io/reader, default-streams-impl #'clojure.java.io/default-streams-impl, delete-file #'clojure.java.io/delete-file, as-file #'clojure.java.io/as-file, resource #'clojure.java.io/resource, input-stream #'clojure.java.io/input-stream, Coercions #'clojure.java.io/Coercions, make-input-stream #'clojure.java.io/make-input-stream, make-writer #'clojure.java.io/make-writer, as-url #'clojure.java.io/as-url, make-reader #'clojure.java.io/make-reader, IOFactory #'clojure.java.io/IOFactory}

(keys (ns-publics 'clojure.java.io))
; => (output-stream copy file writer as-relative-path make-output-stream make-parents reader default-streams-impl delete-file as-file resource input-stream Coercions make-input-stream make-writer as-url make-reader IOFactory)

(use '[clojure.string :only (join)])

(join "," ["a" "b"])
; => "a,b"
