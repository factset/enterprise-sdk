/**
 * Prime Developer Trial
 * No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)
 *
 * The version of the OpenAPI document: v1
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 *
 */

import ApiClient from '../ApiClient';
import InlineResponse20062DataTargetMarketAbilityToBearLosses from './InlineResponse20062DataTargetMarketAbilityToBearLosses';
import InlineResponse20062DataTargetMarketClientObjectivesAndNeeds from './InlineResponse20062DataTargetMarketClientObjectivesAndNeeds';
import InlineResponse20062DataTargetMarketInvestorType from './InlineResponse20062DataTargetMarketInvestorType';
import InlineResponse20062DataTargetMarketKnowledgeAndExperience from './InlineResponse20062DataTargetMarketKnowledgeAndExperience';
import InlineResponse20062DataTargetMarketRecommendedHoldingPeriod from './InlineResponse20062DataTargetMarketRecommendedHoldingPeriod';
import InlineResponse20062DataTargetMarketRiskTolerance from './InlineResponse20062DataTargetMarketRiskTolerance';

/**
 * The InlineResponse20062DataTargetMarket model module.
 * @module model/InlineResponse20062DataTargetMarket
 */
class InlineResponse20062DataTargetMarket {
    /**
     * Constructs a new <code>InlineResponse20062DataTargetMarket</code>.
     * Target market.
     * @alias module:model/InlineResponse20062DataTargetMarket
     */
    constructor() { 
        
        InlineResponse20062DataTargetMarket.initialize(this);
    }

    /**
     * Initializes the fields of this object.
     * This method is used by the constructors of any subclasses, in order to implement multiple inheritance (mix-ins).
     * Only for internal use.
     */
    static initialize(obj) { 
    }

    /**
     * Constructs a <code>InlineResponse20062DataTargetMarket</code> from a plain JavaScript object, optionally creating a new instance.
     * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
     * @param {Object} data The plain JavaScript object bearing properties of interest.
     * @param {module:model/InlineResponse20062DataTargetMarket} obj Optional instance to populate.
     * @return {module:model/InlineResponse20062DataTargetMarket} The populated <code>InlineResponse20062DataTargetMarket</code> instance.
     */
    static constructFromObject(data, obj) {
        if (data) {
            obj = obj || new InlineResponse20062DataTargetMarket();

            if (data.hasOwnProperty('investorType')) {
                obj['investorType'] = InlineResponse20062DataTargetMarketInvestorType.constructFromObject(data['investorType']);
            }
            if (data.hasOwnProperty('knowledgeAndExperience')) {
                obj['knowledgeAndExperience'] = InlineResponse20062DataTargetMarketKnowledgeAndExperience.constructFromObject(data['knowledgeAndExperience']);
            }
            if (data.hasOwnProperty('abilityToBearLosses')) {
                obj['abilityToBearLosses'] = InlineResponse20062DataTargetMarketAbilityToBearLosses.constructFromObject(data['abilityToBearLosses']);
            }
            if (data.hasOwnProperty('riskTolerance')) {
                obj['riskTolerance'] = InlineResponse20062DataTargetMarketRiskTolerance.constructFromObject(data['riskTolerance']);
            }
            if (data.hasOwnProperty('clientObjectivesAndNeeds')) {
                obj['clientObjectivesAndNeeds'] = InlineResponse20062DataTargetMarketClientObjectivesAndNeeds.constructFromObject(data['clientObjectivesAndNeeds']);
            }
            if (data.hasOwnProperty('recommendedHoldingPeriod')) {
                obj['recommendedHoldingPeriod'] = InlineResponse20062DataTargetMarketRecommendedHoldingPeriod.constructFromObject(data['recommendedHoldingPeriod']);
            }
        }
        return obj;
    }


}

/**
 * @member {module:model/InlineResponse20062DataTargetMarketInvestorType} investorType
 */
InlineResponse20062DataTargetMarket.prototype['investorType'] = undefined;

/**
 * @member {module:model/InlineResponse20062DataTargetMarketKnowledgeAndExperience} knowledgeAndExperience
 */
InlineResponse20062DataTargetMarket.prototype['knowledgeAndExperience'] = undefined;

/**
 * @member {module:model/InlineResponse20062DataTargetMarketAbilityToBearLosses} abilityToBearLosses
 */
InlineResponse20062DataTargetMarket.prototype['abilityToBearLosses'] = undefined;

/**
 * @member {module:model/InlineResponse20062DataTargetMarketRiskTolerance} riskTolerance
 */
InlineResponse20062DataTargetMarket.prototype['riskTolerance'] = undefined;

/**
 * @member {module:model/InlineResponse20062DataTargetMarketClientObjectivesAndNeeds} clientObjectivesAndNeeds
 */
InlineResponse20062DataTargetMarket.prototype['clientObjectivesAndNeeds'] = undefined;

/**
 * @member {module:model/InlineResponse20062DataTargetMarketRecommendedHoldingPeriod} recommendedHoldingPeriod
 */
InlineResponse20062DataTargetMarket.prototype['recommendedHoldingPeriod'] = undefined;






export default InlineResponse20062DataTargetMarket;

