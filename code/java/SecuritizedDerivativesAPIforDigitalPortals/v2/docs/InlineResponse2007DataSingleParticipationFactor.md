

# InlineResponse2007DataSingleParticipationFactor

Participation factor of the securitized derivative in the performance of the underlying, depending on the exercise right (see attribute `exercise.right` in endpoint `/securitizedDerivative/get`).

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**positive** | **BigDecimal** | Participation factor above the barrier for a securitized derivative with exercise right call, and below the barrier for exercise right put.  |  [optional]
**negative** | **BigDecimal** | Participation factor above the barrier for a securitized derivative with exercise right put, and below the barrier for exercise right call. |  [optional]


## Implemented Interfaces

* Serializable


