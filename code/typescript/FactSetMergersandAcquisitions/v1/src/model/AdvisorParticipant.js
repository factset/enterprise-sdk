/**
 * FactSet Mergers and Acquisitions API
 * The FactSet Mergers and Acquisitions API provides access to key transactions and pricing metrics on over 60,000 globally traded deals. Reference a Global Universe of Mergers and Acquisitions (M&A) transactions where the target of the deal is a Publicly traded Company. Review premiums, multiples and fundamental data to gather insights on deals and create predictive models based on different deal characteristics.    Monetary values returned by this API are converted and represented in USD.    This API is allows a limit of 10 requests per second and a maximum of 10 concurrent requests. 
 *
 * The version of the OpenAPI document: 1.1.0
 * Contact: api@factset.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 *
 */

import ApiClient from '../ApiClient';

/**
 * The AdvisorParticipant model module.
 * @module model/AdvisorParticipant
 */
class AdvisorParticipant {
    /**
     * Constructs a new <code>AdvisorParticipant</code>.
     * Advisor Participant Object
     * @alias module:model/AdvisorParticipant
     */
    constructor() { 
        
        AdvisorParticipant.initialize(this);
    }

    /**
     * Initializes the fields of this object.
     * This method is used by the constructors of any subclasses, in order to implement multiple inheritance (mix-ins).
     * Only for internal use.
     */
    static initialize(obj) { 
    }

    /**
     * Constructs a <code>AdvisorParticipant</code> from a plain JavaScript object, optionally creating a new instance.
     * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
     * @param {Object} data The plain JavaScript object bearing properties of interest.
     * @param {module:model/AdvisorParticipant} obj Optional instance to populate.
     * @return {module:model/AdvisorParticipant} The populated <code>AdvisorParticipant</code> instance.
     */
    static constructFromObject(data, obj) {
        if (data) {
            obj = obj || new AdvisorParticipant();

            if (data.hasOwnProperty('fsymId')) {
                obj['fsymId'] = ApiClient.convertToType(data['fsymId'], 'String');
            }
            if (data.hasOwnProperty('name')) {
                obj['name'] = ApiClient.convertToType(data['name'], 'String');
            }
            if (data.hasOwnProperty('fees')) {
                obj['fees'] = ApiClient.convertToType(data['fees'], 'Number');
            }
        }
        return obj;
    }


}

/**
 * FactSet Permanent Identifier of the participant. Six alpha-numeric characters, excluding vowels, with an -E suffix (XXXXXX-E). Null values indicate that no data is available.
 * @member {String} fsymId
 */
AdvisorParticipant.prototype['fsymId'] = undefined;

/**
 * Entity name of the advisor. Null values indicate that no data is available.
 * @member {String} name
 */
AdvisorParticipant.prototype['name'] = undefined;

/**
 * Fees of the advisor. All values in millions of USD. Null values indicate that no data is available.
 * @member {Number} fees
 */
AdvisorParticipant.prototype['fees'] = undefined;






export default AdvisorParticipant;

