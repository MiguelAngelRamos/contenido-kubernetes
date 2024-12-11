```sh

kubectl apply -f kubernetes/deployments/mysql-deployment.yaml
deployment.apps/mysql created

kubectl get deployments -n production
NAME    READY   UP-TO-DATE   AVAILABLE   AGE
mysql   0/1     1            0           33s

kubectl get deployments -n production

NAME    READY   UP-TO-DATE   AVAILABLE   AGE
mysql   1/1     1            1           78s

kubectl get pods -n production
NAME                     READY   STATUS    RESTARTS   AGE
mysql-65566ff468-qfb4t   1/1     Running   0          2m25s

kubectl get pods -n production -l app=mysql
NAME                     READY   STATUS    RESTARTS   AGE
mysql-65566ff468-qfb4t   1/1     Running   0          2m37s

kubectl exec -it mysql-65566ff468-qfb4t -n production -- mysql -u root -p

```