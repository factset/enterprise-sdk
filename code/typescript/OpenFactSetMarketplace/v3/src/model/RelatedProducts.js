/**
 * Open:FactSet Marketplace API
 * This API provides read-only access to marketplace products and partners.
 *
 * The version of the OpenAPI document: 3.0.0
 * Contact: api@factset.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 *
 */

import ApiClient from '../ApiClient';

/**
 * The RelatedProducts model module.
 * @module model/RelatedProducts
 */
class RelatedProducts {
    /**
     * Constructs a new <code>RelatedProducts</code>.
     * Related products object
     * @alias module:model/RelatedProducts
     * @param id {String} Product unique identifier
     * @param productPageUrl {String} URL of the product's page on the marketplace catalog.
     * @param title {String} Product title
     */
    constructor(id, productPageUrl, title) { 
        
        RelatedProducts.initialize(this, id, productPageUrl, title);
    }

    /**
     * Initializes the fields of this object.
     * This method is used by the constructors of any subclasses, in order to implement multiple inheritance (mix-ins).
     * Only for internal use.
     */
    static initialize(obj, id, productPageUrl, title) { 
        obj['id'] = id;
        obj['productPageUrl'] = productPageUrl;
        obj['title'] = title;
    }

    /**
     * Constructs a <code>RelatedProducts</code> from a plain JavaScript object, optionally creating a new instance.
     * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
     * @param {Object} data The plain JavaScript object bearing properties of interest.
     * @param {module:model/RelatedProducts} obj Optional instance to populate.
     * @return {module:model/RelatedProducts} The populated <code>RelatedProducts</code> instance.
     */
    static constructFromObject(data, obj) {
        if (data) {
            obj = obj || new RelatedProducts();

            if (data.hasOwnProperty('id')) {
                obj['id'] = ApiClient.convertToType(data['id'], 'String');
            }
            if (data.hasOwnProperty('productPageUrl')) {
                obj['productPageUrl'] = ApiClient.convertToType(data['productPageUrl'], 'String');
            }
            if (data.hasOwnProperty('title')) {
                obj['title'] = ApiClient.convertToType(data['title'], 'String');
            }
        }
        return obj;
    }


}

/**
 * Product unique identifier
 * @member {String} id
 */
RelatedProducts.prototype['id'] = undefined;

/**
 * URL of the product's page on the marketplace catalog.
 * @member {String} productPageUrl
 */
RelatedProducts.prototype['productPageUrl'] = undefined;

/**
 * Product title
 * @member {String} title
 */
RelatedProducts.prototype['title'] = undefined;






export default RelatedProducts;

