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
import InlineResponse20062DataCostsAndChargesExAnte from './InlineResponse20062DataCostsAndChargesExAnte';
import InlineResponse20062DataCostsAndChargesExPost from './InlineResponse20062DataCostsAndChargesExPost';

/**
 * The InlineResponse20062DataCostsAndCharges model module.
 * @module model/InlineResponse20062DataCostsAndCharges
 */
class InlineResponse20062DataCostsAndCharges {
    /**
     * Constructs a new <code>InlineResponse20062DataCostsAndCharges</code>.
     * MiFID cost is the disclosure of information on costs and charges related to an investment product and on the investment or ancillary service provided to a client. MiFID distinguishes between ex-ante and ex-post disclosure of costs.
     * @alias module:model/InlineResponse20062DataCostsAndCharges
     */
    constructor() { 
        
        InlineResponse20062DataCostsAndCharges.initialize(this);
    }

    /**
     * Initializes the fields of this object.
     * This method is used by the constructors of any subclasses, in order to implement multiple inheritance (mix-ins).
     * Only for internal use.
     */
    static initialize(obj) { 
    }

    /**
     * Constructs a <code>InlineResponse20062DataCostsAndCharges</code> from a plain JavaScript object, optionally creating a new instance.
     * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
     * @param {Object} data The plain JavaScript object bearing properties of interest.
     * @param {module:model/InlineResponse20062DataCostsAndCharges} obj Optional instance to populate.
     * @return {module:model/InlineResponse20062DataCostsAndCharges} The populated <code>InlineResponse20062DataCostsAndCharges</code> instance.
     */
    static constructFromObject(data, obj) {
        if (data) {
            obj = obj || new InlineResponse20062DataCostsAndCharges();

            if (data.hasOwnProperty('quotation')) {
                obj['quotation'] = ApiClient.convertToType(data['quotation'], 'String');
            }
            if (data.hasOwnProperty('exAnte')) {
                obj['exAnte'] = InlineResponse20062DataCostsAndChargesExAnte.constructFromObject(data['exAnte']);
            }
            if (data.hasOwnProperty('exPost')) {
                obj['exPost'] = InlineResponse20062DataCostsAndChargesExPost.constructFromObject(data['exPost']);
            }
        }
        return obj;
    }


}

/**
 * Quotation type originally used for providing most of the cost items of the investment product.
 * @member {module:model/InlineResponse20062DataCostsAndCharges.QuotationEnum} quotation
 */
InlineResponse20062DataCostsAndCharges.prototype['quotation'] = undefined;

/**
 * @member {module:model/InlineResponse20062DataCostsAndChargesExAnte} exAnte
 */
InlineResponse20062DataCostsAndCharges.prototype['exAnte'] = undefined;

/**
 * @member {module:model/InlineResponse20062DataCostsAndChargesExPost} exPost
 */
InlineResponse20062DataCostsAndCharges.prototype['exPost'] = undefined;





/**
 * Allowed values for the <code>quotation</code> property.
 * @enum {String}
 * @readonly
 */
InlineResponse20062DataCostsAndCharges['QuotationEnum'] = {

    /**
     * value: "currency"
     * @const
     */
    "currency": "currency",

    /**
     * value: "percent"
     * @const
     */
    "percent": "percent"
};



export default InlineResponse20062DataCostsAndCharges;

