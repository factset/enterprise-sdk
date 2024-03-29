/**
 * FactSet Overview Report Builder API
 * Get relevant industry-specific data for high level analysis of public and private companies
 *
 * The version of the OpenAPI document: 1.2.0
 * Contact: api@factset.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 *
 */

import ApiClient from '../ApiClient';
import KeyStatsEntityObjectActiveInvestors from './KeyStatsEntityObjectActiveInvestors';
import KeyStatsEntityObjectAverageDailyVol from './KeyStatsEntityObjectAverageDailyVol';
import KeyStatsEntityObjectAverageRating from './KeyStatsEntityObjectAverageRating';
import KeyStatsEntityObjectBasicShares from './KeyStatsEntityObjectBasicShares';
import KeyStatsEntityObjectBranches from './KeyStatsEntityObjectBranches';
import KeyStatsEntityObjectBrokerContributors from './KeyStatsEntityObjectBrokerContributors';
import KeyStatsEntityObjectDilutedMarketCap from './KeyStatsEntityObjectDilutedMarketCap';
import KeyStatsEntityObjectDilutedShares from './KeyStatsEntityObjectDilutedShares';
import KeyStatsEntityObjectDividendYield from './KeyStatsEntityObjectDividendYield';
import KeyStatsEntityObjectEmployees from './KeyStatsEntityObjectEmployees';
import KeyStatsEntityObjectEnterpriseValue from './KeyStatsEntityObjectEnterpriseValue';
import KeyStatsEntityObjectEstimatedVcRaised from './KeyStatsEntityObjectEstimatedVcRaised';
import KeyStatsEntityObjectFirstDate from './KeyStatsEntityObjectFirstDate';
import KeyStatsEntityObjectFirstFunding from './KeyStatsEntityObjectFirstFunding';
import KeyStatsEntityObjectFloat from './KeyStatsEntityObjectFloat';
import KeyStatsEntityObjectFundingRounds from './KeyStatsEntityObjectFundingRounds';
import KeyStatsEntityObjectGrossAssets from './KeyStatsEntityObjectGrossAssets';
import KeyStatsEntityObjectGrossPremiums from './KeyStatsEntityObjectGrossPremiums';
import KeyStatsEntityObjectInstitutional from './KeyStatsEntityObjectInstitutional';
import KeyStatsEntityObjectLastFunding from './KeyStatsEntityObjectLastFunding';
import KeyStatsEntityObjectLatestPostMoneyValuation from './KeyStatsEntityObjectLatestPostMoneyValuation';
import KeyStatsEntityObjectLtGrowthRate from './KeyStatsEntityObjectLtGrowthRate';
import KeyStatsEntityObjectMarketCap from './KeyStatsEntityObjectMarketCap';
import KeyStatsEntityObjectMeta from './KeyStatsEntityObjectMeta';
import KeyStatsEntityObjectNetInterestIncome from './KeyStatsEntityObjectNetInterestIncome';
import KeyStatsEntityObjectPremiums from './KeyStatsEntityObjectPremiums';
import KeyStatsEntityObjectRange52Week from './KeyStatsEntityObjectRange52Week';
import KeyStatsEntityObjectRevenue from './KeyStatsEntityObjectRevenue';
import KeyStatsEntityObjectTargetPrice from './KeyStatsEntityObjectTargetPrice';
import KeyStatsEntityObjectTop10InstitutionalHolders from './KeyStatsEntityObjectTop10InstitutionalHolders';
import KeyStatsEntityObjectTotalDeposits from './KeyStatsEntityObjectTotalDeposits';
import KeyStatsEntityObjectTotalInvestors from './KeyStatsEntityObjectTotalInvestors';
import KeyStatsEntityObjectWacc from './KeyStatsEntityObjectWacc';

/**
 * The KeyStatsEntityObject model module.
 * @module model/KeyStatsEntityObject
 */
class KeyStatsEntityObject {
    /**
     * Constructs a new <code>KeyStatsEntityObject</code>.
     * Key Statistics for the provided entity
     * @alias module:model/KeyStatsEntityObject
     */
    constructor() { 
        
        KeyStatsEntityObject.initialize(this);
    }

    /**
     * Initializes the fields of this object.
     * This method is used by the constructors of any subclasses, in order to implement multiple inheritance (mix-ins).
     * Only for internal use.
     */
    static initialize(obj) { 
    }

    /**
     * Constructs a <code>KeyStatsEntityObject</code> from a plain JavaScript object, optionally creating a new instance.
     * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
     * @param {Object} data The plain JavaScript object bearing properties of interest.
     * @param {module:model/KeyStatsEntityObject} obj Optional instance to populate.
     * @return {module:model/KeyStatsEntityObject} The populated <code>KeyStatsEntityObject</code> instance.
     */
    static constructFromObject(data, obj) {
        if (data) {
            obj = obj || new KeyStatsEntityObject();

            if (data.hasOwnProperty('range52Week')) {
                obj['range52Week'] = KeyStatsEntityObjectRange52Week.constructFromObject(data['range52Week']);
            }
            if (data.hasOwnProperty('averageDailyVol')) {
                obj['averageDailyVol'] = KeyStatsEntityObjectAverageDailyVol.constructFromObject(data['averageDailyVol']);
            }
            if (data.hasOwnProperty('basicShares')) {
                obj['basicShares'] = KeyStatsEntityObjectBasicShares.constructFromObject(data['basicShares']);
            }
            if (data.hasOwnProperty('marketCap')) {
                obj['marketCap'] = KeyStatsEntityObjectMarketCap.constructFromObject(data['marketCap']);
            }
            if (data.hasOwnProperty('dividendYield')) {
                obj['dividendYield'] = KeyStatsEntityObjectDividendYield.constructFromObject(data['dividendYield']);
            }
            if (data.hasOwnProperty('firstDate')) {
                obj['firstDate'] = KeyStatsEntityObjectFirstDate.constructFromObject(data['firstDate']);
            }
            if (data.hasOwnProperty('dilutedShares')) {
                obj['dilutedShares'] = KeyStatsEntityObjectDilutedShares.constructFromObject(data['dilutedShares']);
            }
            if (data.hasOwnProperty('dilutedMarketCap')) {
                obj['dilutedMarketCap'] = KeyStatsEntityObjectDilutedMarketCap.constructFromObject(data['dilutedMarketCap']);
            }
            if (data.hasOwnProperty('enterpriseValue')) {
                obj['enterpriseValue'] = KeyStatsEntityObjectEnterpriseValue.constructFromObject(data['enterpriseValue']);
            }
            if (data.hasOwnProperty('wacc')) {
                obj['wacc'] = KeyStatsEntityObjectWacc.constructFromObject(data['wacc']);
            }
            if (data.hasOwnProperty('float')) {
                obj['float'] = KeyStatsEntityObjectFloat.constructFromObject(data['float']);
            }
            if (data.hasOwnProperty('institutional')) {
                obj['institutional'] = KeyStatsEntityObjectInstitutional.constructFromObject(data['institutional']);
            }
            if (data.hasOwnProperty('top10InstitutionalHolders')) {
                obj['top10InstitutionalHolders'] = KeyStatsEntityObjectTop10InstitutionalHolders.constructFromObject(data['top10InstitutionalHolders']);
            }
            if (data.hasOwnProperty('brokerContributors')) {
                obj['brokerContributors'] = KeyStatsEntityObjectBrokerContributors.constructFromObject(data['brokerContributors']);
            }
            if (data.hasOwnProperty('averageRating')) {
                obj['averageRating'] = KeyStatsEntityObjectAverageRating.constructFromObject(data['averageRating']);
            }
            if (data.hasOwnProperty('targetPrice')) {
                obj['targetPrice'] = KeyStatsEntityObjectTargetPrice.constructFromObject(data['targetPrice']);
            }
            if (data.hasOwnProperty('ltGrowthRate')) {
                obj['ltGrowthRate'] = KeyStatsEntityObjectLtGrowthRate.constructFromObject(data['ltGrowthRate']);
            }
            if (data.hasOwnProperty('revenue')) {
                obj['revenue'] = KeyStatsEntityObjectRevenue.constructFromObject(data['revenue']);
            }
            if (data.hasOwnProperty('employees')) {
                obj['employees'] = KeyStatsEntityObjectEmployees.constructFromObject(data['employees']);
            }
            if (data.hasOwnProperty('fundingRounds')) {
                obj['fundingRounds'] = KeyStatsEntityObjectFundingRounds.constructFromObject(data['fundingRounds']);
            }
            if (data.hasOwnProperty('estimatedVcRaised')) {
                obj['estimatedVcRaised'] = KeyStatsEntityObjectEstimatedVcRaised.constructFromObject(data['estimatedVcRaised']);
            }
            if (data.hasOwnProperty('lastFunding')) {
                obj['lastFunding'] = KeyStatsEntityObjectLastFunding.constructFromObject(data['lastFunding']);
            }
            if (data.hasOwnProperty('firstFunding')) {
                obj['firstFunding'] = KeyStatsEntityObjectFirstFunding.constructFromObject(data['firstFunding']);
            }
            if (data.hasOwnProperty('latestPostMoneyValuation')) {
                obj['latestPostMoneyValuation'] = KeyStatsEntityObjectLatestPostMoneyValuation.constructFromObject(data['latestPostMoneyValuation']);
            }
            if (data.hasOwnProperty('activeInvestors')) {
                obj['activeInvestors'] = KeyStatsEntityObjectActiveInvestors.constructFromObject(data['activeInvestors']);
            }
            if (data.hasOwnProperty('totalInvestors')) {
                obj['totalInvestors'] = KeyStatsEntityObjectTotalInvestors.constructFromObject(data['totalInvestors']);
            }
            if (data.hasOwnProperty('premiums')) {
                obj['premiums'] = KeyStatsEntityObjectPremiums.constructFromObject(data['premiums']);
            }
            if (data.hasOwnProperty('grossPremiums')) {
                obj['grossPremiums'] = KeyStatsEntityObjectGrossPremiums.constructFromObject(data['grossPremiums']);
            }
            if (data.hasOwnProperty('grossAssets')) {
                obj['grossAssets'] = KeyStatsEntityObjectGrossAssets.constructFromObject(data['grossAssets']);
            }
            if (data.hasOwnProperty('totalDeposits')) {
                obj['totalDeposits'] = KeyStatsEntityObjectTotalDeposits.constructFromObject(data['totalDeposits']);
            }
            if (data.hasOwnProperty('branches')) {
                obj['branches'] = KeyStatsEntityObjectBranches.constructFromObject(data['branches']);
            }
            if (data.hasOwnProperty('netInterestIncome')) {
                obj['netInterestIncome'] = KeyStatsEntityObjectNetInterestIncome.constructFromObject(data['netInterestIncome']);
            }
            if (data.hasOwnProperty('meta')) {
                obj['meta'] = KeyStatsEntityObjectMeta.constructFromObject(data['meta']);
            }
        }
        return obj;
    }


}

/**
 * @member {module:model/KeyStatsEntityObjectRange52Week} range52Week
 */
KeyStatsEntityObject.prototype['range52Week'] = undefined;

/**
 * @member {module:model/KeyStatsEntityObjectAverageDailyVol} averageDailyVol
 */
KeyStatsEntityObject.prototype['averageDailyVol'] = undefined;

/**
 * @member {module:model/KeyStatsEntityObjectBasicShares} basicShares
 */
KeyStatsEntityObject.prototype['basicShares'] = undefined;

/**
 * @member {module:model/KeyStatsEntityObjectMarketCap} marketCap
 */
KeyStatsEntityObject.prototype['marketCap'] = undefined;

/**
 * @member {module:model/KeyStatsEntityObjectDividendYield} dividendYield
 */
KeyStatsEntityObject.prototype['dividendYield'] = undefined;

/**
 * @member {module:model/KeyStatsEntityObjectFirstDate} firstDate
 */
KeyStatsEntityObject.prototype['firstDate'] = undefined;

/**
 * @member {module:model/KeyStatsEntityObjectDilutedShares} dilutedShares
 */
KeyStatsEntityObject.prototype['dilutedShares'] = undefined;

/**
 * @member {module:model/KeyStatsEntityObjectDilutedMarketCap} dilutedMarketCap
 */
KeyStatsEntityObject.prototype['dilutedMarketCap'] = undefined;

/**
 * @member {module:model/KeyStatsEntityObjectEnterpriseValue} enterpriseValue
 */
KeyStatsEntityObject.prototype['enterpriseValue'] = undefined;

/**
 * @member {module:model/KeyStatsEntityObjectWacc} wacc
 */
KeyStatsEntityObject.prototype['wacc'] = undefined;

/**
 * @member {module:model/KeyStatsEntityObjectFloat} float
 */
KeyStatsEntityObject.prototype['float'] = undefined;

/**
 * @member {module:model/KeyStatsEntityObjectInstitutional} institutional
 */
KeyStatsEntityObject.prototype['institutional'] = undefined;

/**
 * @member {module:model/KeyStatsEntityObjectTop10InstitutionalHolders} top10InstitutionalHolders
 */
KeyStatsEntityObject.prototype['top10InstitutionalHolders'] = undefined;

/**
 * @member {module:model/KeyStatsEntityObjectBrokerContributors} brokerContributors
 */
KeyStatsEntityObject.prototype['brokerContributors'] = undefined;

/**
 * @member {module:model/KeyStatsEntityObjectAverageRating} averageRating
 */
KeyStatsEntityObject.prototype['averageRating'] = undefined;

/**
 * @member {module:model/KeyStatsEntityObjectTargetPrice} targetPrice
 */
KeyStatsEntityObject.prototype['targetPrice'] = undefined;

/**
 * @member {module:model/KeyStatsEntityObjectLtGrowthRate} ltGrowthRate
 */
KeyStatsEntityObject.prototype['ltGrowthRate'] = undefined;

/**
 * @member {module:model/KeyStatsEntityObjectRevenue} revenue
 */
KeyStatsEntityObject.prototype['revenue'] = undefined;

/**
 * @member {module:model/KeyStatsEntityObjectEmployees} employees
 */
KeyStatsEntityObject.prototype['employees'] = undefined;

/**
 * @member {module:model/KeyStatsEntityObjectFundingRounds} fundingRounds
 */
KeyStatsEntityObject.prototype['fundingRounds'] = undefined;

/**
 * @member {module:model/KeyStatsEntityObjectEstimatedVcRaised} estimatedVcRaised
 */
KeyStatsEntityObject.prototype['estimatedVcRaised'] = undefined;

/**
 * @member {module:model/KeyStatsEntityObjectLastFunding} lastFunding
 */
KeyStatsEntityObject.prototype['lastFunding'] = undefined;

/**
 * @member {module:model/KeyStatsEntityObjectFirstFunding} firstFunding
 */
KeyStatsEntityObject.prototype['firstFunding'] = undefined;

/**
 * @member {module:model/KeyStatsEntityObjectLatestPostMoneyValuation} latestPostMoneyValuation
 */
KeyStatsEntityObject.prototype['latestPostMoneyValuation'] = undefined;

/**
 * @member {module:model/KeyStatsEntityObjectActiveInvestors} activeInvestors
 */
KeyStatsEntityObject.prototype['activeInvestors'] = undefined;

/**
 * @member {module:model/KeyStatsEntityObjectTotalInvestors} totalInvestors
 */
KeyStatsEntityObject.prototype['totalInvestors'] = undefined;

/**
 * @member {module:model/KeyStatsEntityObjectPremiums} premiums
 */
KeyStatsEntityObject.prototype['premiums'] = undefined;

/**
 * @member {module:model/KeyStatsEntityObjectGrossPremiums} grossPremiums
 */
KeyStatsEntityObject.prototype['grossPremiums'] = undefined;

/**
 * @member {module:model/KeyStatsEntityObjectGrossAssets} grossAssets
 */
KeyStatsEntityObject.prototype['grossAssets'] = undefined;

/**
 * @member {module:model/KeyStatsEntityObjectTotalDeposits} totalDeposits
 */
KeyStatsEntityObject.prototype['totalDeposits'] = undefined;

/**
 * @member {module:model/KeyStatsEntityObjectBranches} branches
 */
KeyStatsEntityObject.prototype['branches'] = undefined;

/**
 * @member {module:model/KeyStatsEntityObjectNetInterestIncome} netInterestIncome
 */
KeyStatsEntityObject.prototype['netInterestIncome'] = undefined;

/**
 * @member {module:model/KeyStatsEntityObjectMeta} meta
 */
KeyStatsEntityObject.prototype['meta'] = undefined;






export default KeyStatsEntityObject;

