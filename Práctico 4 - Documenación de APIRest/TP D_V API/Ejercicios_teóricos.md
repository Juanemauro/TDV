# Ejercicios Teóricos

## Automatización

### ¿Todo tipo de test es automatizable? ¿Cuando es recomendable automatizar y cuando no? ¿Qué beneficios brinda la automatización?**
 _No todos los tests son automatizables. Cuando se requieren múltiples valores para los datos con los que estamos trabajando o información detallada (SQL por ejemplo), o ejecutados en varios ambientes. No es recomendable automatizar cuando se ejecutan una sola vez, ni tampoco cuando son tests de usabilidad ya que estos serían muy subjetivos y no nos darían ningún resultado coherente. También, si tengo que probar el acceso a un dominio es preferible hacer la prueba manual._
#### **Los principales beneficios de la automatización son:**
- Ganancia de tiempo (este es el principal de todos).
- Reutilización de tests.
- Escalabilidad.
- Automatización descrita en un programa y siempre se va a ejecutar la misma prueba.
- No se pueden alterar los pasos.

## Base de datos

1. ¿Para qué sirve la matriz de impactos?
2. ¿En qué influyen los ambientes (desarrollo/pruebas/producción) al realizar el planner de una consulta?
3. ¿Cuál es la complejidad de recrear un fallo debido a problemas de concurrencia?

_1. La Matriz de Impacto sirve para determinar qué objetos se van a modificar pero no solamente esto. Gracias a ella podemos saber la repercusión (el daño) que tiene en nuestra BDD al manipular tanto datos como estructuras más complejas como tablas, triggers, vistas, etc. Se recomienda tener en cuenta estas consideraciones en la etapa de análisis y la etapa de alcance. La Matriz de impacto no es algo de BDD, es un concepto más global que se aplica a cualquier desarrollo._

_2. Al trabajar con más de un ambiente de desarrollo, al tener más de un ambiente, todo es más atómico. En cambio si tenemos uno solo, todos los desarrolladores compiten por el mismo espacio. Las modificaciones aplicadas pueden repercutir y hacer que dejen de funcionar correctamente algunas features. Además los accesos (permisos) cambian para los distintos desarrolladores. Es aquí donde pueden surgir problemas de validez y de consistencia. Lo ideal es tener más de un ambiente, y probarlo en pre-producción y si se puede en producción para saber frente a qué estamos parados._

_3. El clásico ejemplo de concurrencia es el control de stock de un producto (por ejemplo al querer comprar una entrada para un evento y hay otra (o muchas) personas haciéndolo al mismo tiempo). Es uno de los principales problemas para que falle la integridad de los datos. Se puede solucionar limitando a una sola instancia o también con soluciones más complejas. Cuando más sencillo es el control mejor anda. Hay que conocer el negocio para saber sobre qué estamos tratando (si hay un solo usuario utilizando esa funcionalidad, lo hacemos para que lo utilice uno solo). Esta parte es lo más difícil de testear y de garantizar su correcta funcionalidad. Los interrogantes que surgen son cómo hacer para probarlo o para darte cuenta dónde está el problema (detectar la falla). Una buena práctica es tener un registro de los usuarios que modificaron los datos (y en qué momento se realizaron)._

