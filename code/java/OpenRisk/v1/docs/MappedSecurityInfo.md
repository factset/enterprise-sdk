

# MappedSecurityInfo

Risk model covered security resolution

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**covered** | **Boolean** | Coverage flag. The value will always be true to indicate the security is covered. | 
**id** | **String** | Risk model canonical security identifier alias if directly covered in the model | 
**modelClass** | [**ModelClassEnum**](#ModelClassEnum) | **(since 1.19.0)** Security asset classification according to the risk model, if available and determinable | 



## Enum: ModelClassEnum

Name | Value
---- | -----
ABSBOND | &quot;AbsBond&quot;
ABSCMBSBOND | &quot;AbsCmbsBond&quot;
AGENCYBOND | &quot;AgencyBond&quot;
AGENCYMUNICIPALMEANBOND | &quot;AgencyMunicipalMeanBond&quot;
ALLOTHERBOND | &quot;AllOtherBond&quot;
APPENDFILE | &quot;AppendFile&quot;
BANKLOAN | &quot;BankLoan&quot;
BONDOPTION | &quot;BondOption&quot;
BRAZILIANLFT | &quot;BrazilianLft&quot;
CASH | &quot;Cash&quot;
CASHFORWARD | &quot;CashForward&quot;
CMBSBOND | &quot;CmbsBond&quot;
COMMODITY | &quot;Commodity&quot;
COMMODITYFUTURE | &quot;CommodityFuture&quot;
COMMODITYFUTUREOPTION | &quot;CommodityFutureOption&quot;
COMPOSITEASSET | &quot;CompositeAsset&quot;
CONTRACTFORDIFFERENCE | &quot;ContractForDifference&quot;
CONVERTIBLEBOND | &quot;ConvertibleBond&quot;
CORPORATEBOND | &quot;CorporateBond&quot;
CREDITDEFAULTSWAP | &quot;CreditDefaultSwap&quot;
CREDITDEFAULTSWAPTION | &quot;CreditDefaultSwaption&quot;
CREDITDEFAULTSWAPINDEX | &quot;CreditDefaultSwapIndex&quot;
CURRENCYFUTURE | &quot;CurrencyFuture&quot;
CURRENCYOPTION | &quot;CurrencyOption&quot;
DANISHMBSBOND | &quot;DanishMbsBond&quot;
EQUITY | &quot;Equity&quot;
EQUITYDERIVATIVE | &quot;EquityDerivative&quot;
EQUITYINDEXFUTURE | &quot;EquityIndexFuture&quot;
EQUITYOPTION | &quot;EquityOption&quot;
EUROSOVEREIGNBOND | &quot;EuroSovereignBond&quot;
EUROSOVEREIGNGOVTBONDFUTURE | &quot;EuroSovereignGovtBondFuture&quot;
FIXEDINCOME | &quot;FixedIncome&quot;
FIXEDINCOMESECURITY | &quot;FixedIncomeSecurity&quot;
FIXEDINCOMESECURITYNOSPREAD | &quot;FixedIncomeSecurityNoSpread&quot;
FIXEDINCOMESECURITYWITHSPREAD | &quot;FixedIncomeSecurityWithSpread&quot;
GOVERNMENTBONDFUTURE | &quot;GovernmentBondFuture&quot;
GOVERNMENTBONDFUTUREOPTION | &quot;GovernmentBondFutureOption&quot;
GOVERNMENTBONDNOSPREAD | &quot;GovernmentBondNoSpread&quot;
HARDCURRENCYBOND | &quot;HardCurrencyBond&quot;
HARDCURRENCYBONDPROXY | &quot;HardCurrencyBondProxy&quot;
INDEXPROXYBOND | &quot;IndexProxyBond&quot;
INTERESTRATECOLLAR | &quot;InterestRateCollar&quot;
INTERESTRATEFUTURE | &quot;InterestRateFuture&quot;
INTERESTRATEOPTION | &quot;InterestRateOption&quot;
INTERESTRATESWAP | &quot;InterestRateSwap&quot;
INTERESTRATECAPFLOOR | &quot;InterestRateCapFloor&quot;
JAPANESEMBSBOND | &quot;JapaneseMbsBond&quot;
LIABILITY | &quot;Liability&quot;
MBSBOND | &quot;MbsBond&quot;
MONEYMARKET | &quot;MoneyMarket&quot;
MUNICIPALUSABOND | &quot;MunicipalUsaBond&quot;
OFFSETCASH | &quot;OffsetCash&quot;
PRIVATECORPORATEBONDISSUER | &quot;PrivateCorporateBondIssuer&quot;
PRIVATEEUROSOVEREIGNBONDISSUER | &quot;PrivateEuroSovereignBondIssuer&quot;
PRIVATEPRIMARYSECURITY | &quot;PrivatePrimarySecurity&quot;
REALGOVERNMENTBONDNOSPREAD | &quot;RealGovernmentBondNoSpread&quot;
RETURNSBASEDASSET | &quot;ReturnsBasedAsset&quot;
SUPRANATIONALAGENCYMEANBOND | &quot;SupraNationalAgencyMeanBond&quot;
SWAPTION | &quot;Swaption&quot;
TIPSBOND | &quot;TipsBond&quot;
TIPSMEANBOND | &quot;TipsMeanBond&quot;
TIPSSWAP | &quot;TipsSwap&quot;
TOTALRETURNSWAP | &quot;TotalReturnSwap&quot;
UNASSIGNED | &quot;Unassigned&quot;
UNKNOWN | &quot;Unknown&quot;
VIXFUTURE | &quot;VixFuture&quot;
VIXOPTION | &quot;VixOption&quot;
VIXUNDERLYINGSECURITY | &quot;VixUnderlyingSecurity&quot;
ZEROEXPOSURESECURITY | &quot;ZeroExposureSecurity&quot;


## Implemented Interfaces

* Serializable


