/*
 * VRS API documentation
 *
 * Documentation on all available end points in the VRSAPI
 *
 * The version of the OpenAPI document: v1
 * Generated by: https://github.com/openapitools/openapi-generator.git
 */


using System;

namespace FactSet.SDK.Vermilion.Client
{
    /// <summary>
    /// A delegate to ExceptionFactory method
    /// </summary>
    /// <param name="methodName">Method name</param>
    /// <param name="response">Response</param>
    /// <returns>Exceptions</returns>
    public delegate Exception ExceptionFactory(string methodName, IApiResponse response);
}