// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.

using Microsoft.TypeSpec.Generator.Expressions;
using static Microsoft.TypeSpec.Generator.Snippets.Snippet;

namespace Microsoft.TypeSpec.Generator.Snippets
{
    public static class LongSnippets
    {
        public static ScopedApi<string> InvokeToString(this ScopedApi<long> longExpression, ValueExpression formatProvider)
            => longExpression.Invoke(nameof(long.ToString), formatProvider).As<string>();

        public static ScopedApi<long> Parse(ValueExpression value, ValueExpression formatProvider)
            => Static<long>().Invoke(nameof(long.Parse), [value, formatProvider]).As<long>();

        public static ScopedApi<long> Add(this ScopedApi<long> longExpression, ScopedApi<long> value)
            => new BinaryOperatorExpression("+", longExpression, value).As<long>();
    }
}
