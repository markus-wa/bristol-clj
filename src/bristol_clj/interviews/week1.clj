(ns bristol_clj.interviews.week1)

(defn all-unique [s]
  (= (distinct s) (seq s)))

;; (time (all-unique (take 10000000 (range))))
;; => "Elapsed time: 12713.697533 msecs"

(defn all-unique2 [s]
  (loop [i    0
         s    s
         seen #{}]
    (if (not= i (count s))
      false
      (if (not s)
        true
        (recur (inc i)
               (rest s)
               (into seen #{(first s)}))))))

;; (time (all-unique2 (take 10000000 (range))))
;; => "Elapsed time: 3752.900483 msecs"
