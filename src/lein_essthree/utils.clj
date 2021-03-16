(ns lein-essthree.utils
  (:import com.amazonaws.auth.profile.ProfileCredentialsProvider))

(defn aws-credentials []
  (let [creds (.getCredentials (ProfileCredentialsProvider.))]
    {:access-key-id (.getAWSAccessKeyId creds)
     :secret-key (.getAWSSecretKey creds)}))
