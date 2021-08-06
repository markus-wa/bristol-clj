(ns bristol_clj.interviews.week1)

(defn all-unique [s]
  (= (distinct s) (seq s)))

;; (time (all-unique (take 10000000 (range))))
;; => "Elapsed time: 14678.398182 msecs"

(defn all-unique2 [s]
  (loop [i    0
         s    s
         seen #{}]
    (if (not= i (count seen))
      false
      (if (not (seq s))
        true
        (recur (inc i)
               (rest s)
               (conj seen (first s)))))))

;; (time (all-unique2 (take 10000000 (range))))
;; => "Elapsed time: 7526.651055 msecs"
