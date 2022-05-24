# FactSet.SDK.FundsAPIforDigitalPortals.Model.InlineResponse2006DataFees
Annualized fund fees.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**AllIn** | **decimal** | All-in fee. It is a measure of the total costs associated with investing in the fund and includes managing and operating costs. | [optional] 
**CustodianBank** | **decimal** | Custodian bank fee. It is paid from the assets of the fund to the custodian bank (see attribute custodianBank) for holding the fund&#39;s assets. | [optional] 
**Switching** | **decimal** | Switching fee. It is paid for moving an investment from one fund to another within the same umbrella fund. | [optional] 
**MaximumAdvisor** | **decimal** | Maximum possible value of the advisor fee. It is paid from the assets of the investment fund to the fund company for advisory services. | [optional] 
**MaximumAdministration** | **decimal** | Maximum possible value of the administration fee. It is paid for running and administration of the fund excluding expenses for an advisor and/or a manager. | [optional] 
**MaximumDistribution** | **decimal** | Maximum possible value of the distribution fee. It s paid for distribution services provided by a distribution agent. | [optional] 
**MaximumHandling** | **decimal** | Maximum possible value of the handling fee. It is paid for handling services of a fund. This fee may include, but is not limited to, the administration fee, the management fee, and the distribution fee. | [optional] 
**Ongoing** | [**InlineResponse2006DataFeesOngoing**](InlineResponse2006DataFeesOngoing.md) |  | [optional] 
**Performance** | [**InlineResponse2006DataFeesPerformance**](InlineResponse2006DataFeesPerformance.md) |  | [optional] 
**Management** | [**InlineResponse2006DataFeesManagement**](InlineResponse2006DataFeesManagement.md) |  | [optional] 
**MaximumRedemption** | [**List&lt;InlineResponse2006DataFeesMaximumRedemption&gt;**](InlineResponse2006DataFeesMaximumRedemption.md) | Maximum possible value of the redemption fee. It is a proportion of the redeemed investment amount paid once by the investor to the fund company when selling fund shares of the share class. Also called selling fee or exit charge. | [optional] 
**Initial** | [**InlineResponse2006DataFeesInitial**](InlineResponse2006DataFeesInitial.md) |  | [optional] 

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

