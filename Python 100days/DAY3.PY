def summarize_text(text, max_sentences=3):
    import re
    from collections import Counter

    # Clean text
    text = re.sub(r'\s+', ' ', text)
    sentences = re.split(r'(?<=[.!?]) +', text)

    if len(sentences) <= max_sentences:
        return text

    # Build word frequency
    words = re.findall(r'\w+', text.lower())
    freq = Counter(words)

    # Score sentences
    sentence_scores = {}
    for sentence in sentences:
        for word in re.findall(r'\w+', sentence.lower()):
            sentence_scores[sentence] = sentence_scores.get(sentence, 0) + freq[word]

    # Pick top sentences
    summary = sorted(sentence_scores, key=sentence_scores.get, reverse=True)[:max_sentences]

    return " ".join(summary)


# Example usage
if __name__ == "__main__":
    text = """
    Artificial Intelligence is transforming the world.
    It is used in healthcare, finance, education, and more.
    Machine learning allows systems to learn from data.
    AI engineers build models that solve real-world problems.
    """

    print(summarize_text(text))
