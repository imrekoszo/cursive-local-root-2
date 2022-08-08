(ns clr2.alpha.core) ;; find usages doesn't find anything

;; editing is allowed despite Reader Mode

(defn alpha [] ;; find usages finds usage in beta only
  (+ 1 2))
