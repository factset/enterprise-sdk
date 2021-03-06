/**
 * FactSet Terms & Conditions API
 * The FactSet Terms & Conditions API exposes Terms & Conditions data for Fixed Income Corporate, Governement & Agency securities. The FactSet Corporate Government & Agency Terms & Conditions library provides descriptive data on the issue level, such as offering details, redemption information, and coupon schedules. Issuer level data is also available. Coverage is global and includes corporate, sovereign, and agency issues. 
 *
 * The version of the OpenAPI document: 1.0.0
 * Contact: api@factset.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 *
 */

import ApiClient from '../ApiClient';

/**
 * The RedemptionPrice model module.
 * @module model/RedemptionPrice
 */
class RedemptionPrice {
    /**
     * Constructs a new <code>RedemptionPrice</code>.
     * Redemption Price Data Items for a Fixed Income security.
     * @alias module:model/RedemptionPrice
     * @param requestId {String} Security identifier used in the request.
     * @param fsymId {String} FactSet Permanent Security Identifier.
     * @param date {Date} Date of the Redemption Price.
     * @param category {module:model/RedemptionPrice.CategoryEnum} Redemption Price Category - * **CALL** = Call prices. * **PUT** = Put prices. * **SF** = Sinking Fund prices. 
     */
    constructor(requestId, fsymId, date, category) { 
        
        RedemptionPrice.initialize(this, requestId, fsymId, date, category);
    }

    /**
     * Initializes the fields of this object.
     * This method is used by the constructors of any subclasses, in order to implement multiple inheritance (mix-ins).
     * Only for internal use.
     */
    static initialize(obj, requestId, fsymId, date, category) { 
        obj['requestId'] = requestId;
        obj['fsymId'] = fsymId;
        obj['date'] = date;
        obj['category'] = category;
    }

    /**
     * Constructs a <code>RedemptionPrice</code> from a plain JavaScript object, optionally creating a new instance.
     * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
     * @param {Object} data The plain JavaScript object bearing properties of interest.
     * @param {module:model/RedemptionPrice} obj Optional instance to populate.
     * @return {module:model/RedemptionPrice} The populated <code>RedemptionPrice</code> instance.
     */
    static constructFromObject(data, obj) {
        if (data) {
            obj = obj || new RedemptionPrice();

            if (data.hasOwnProperty('requestId')) {
                obj['requestId'] = ApiClient.convertToType(data['requestId'], 'String');
            }
            if (data.hasOwnProperty('fsymId')) {
                obj['fsymId'] = ApiClient.convertToType(data['fsymId'], 'String');
            }
            if (data.hasOwnProperty('date')) {
                obj['date'] = ApiClient.convertToType(data['date'], 'Date');
            }
            if (data.hasOwnProperty('category')) {
                obj['category'] = ApiClient.convertToType(data['category'], 'String');
            }
            if (data.hasOwnProperty('minAmt')) {
                obj['minAmt'] = ApiClient.convertToType(data['minAmt'], 'Number');
            }
            if (data.hasOwnProperty('price')) {
                obj['price'] = ApiClient.convertToType(data['price'], 'Number');
            }
        }
        return obj;
    }


}

/**
 * Security identifier used in the request.
 * @member {String} requestId
 */
RedemptionPrice.prototype['requestId'] = undefined;

/**
 * FactSet Permanent Security Identifier.
 * @member {String} fsymId
 */
RedemptionPrice.prototype['fsymId'] = undefined;

/**
 * Date of the Redemption Price.
 * @member {Date} date
 */
RedemptionPrice.prototype['date'] = undefined;

/**
 * Redemption Price Category - * **CALL** = Call prices. * **PUT** = Put prices. * **SF** = Sinking Fund prices. 
 * @member {module:model/RedemptionPrice.CategoryEnum} category
 */
RedemptionPrice.prototype['category'] = undefined;

/**
 * Sinking Fund minimum amount.
 * @member {Number} minAmt
 */
RedemptionPrice.prototype['minAmt'] = undefined;

/**
 * Redemption price for the category.
 * @member {Number} price
 */
RedemptionPrice.prototype['price'] = undefined;





/**
 * Allowed values for the <code>category</code> property.
 * @enum {String}
 * @readonly
 */
RedemptionPrice['CategoryEnum'] = {

    /**
     * value: "CALL"
     * @const
     */
    "CALL": "CALL",

    /**
     * value: "PUT"
     * @const
     */
    "PUT": "PUT",

    /**
     * value: "SF"
     * @const
     */
    "SF": "SF"
};



export default RedemptionPrice;

