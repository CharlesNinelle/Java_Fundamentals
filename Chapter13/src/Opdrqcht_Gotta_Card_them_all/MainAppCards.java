package Opdrqcht_Gotta_Card_them_all;

import java.util.*;

public class MainAppCards {
    public static void main(String[] args) {
        List<PostCard> yourPostCardList = new ArrayList<>();
        List<PostCard> yourFriendsPostCardList = new ArrayList<>();

        // Your postcards
        PostCard belgium = new PostCard("Belgium", "Europe");
        PostCard france = new PostCard("France", "Europe");
        PostCard japan = new PostCard("Japan", "Asia");
        PostCard rdc = new PostCard("Democratic Republic of Congo", "Africa");
        PostCard southKorea = new PostCard("South Korea", "Asia");
        PostCard belgium2 = new PostCard("Belgium", "Europe");
        PostCard southAfrica = new PostCard("South Africa", "Africa");
        PostCard france2 = new PostCard("France", "Europe");
        PostCard belgium3 = new PostCard("Belgium", "Europe");
        PostCard usa = new PostCard("United States of America", "North America");
        PostCard canada = new PostCard("Canada", "North America");
        PostCard peru = new PostCard("Peru", "South America");
        PostCard samoa = new PostCard("Samoa", "Oceania");
        PostCard belgium4 = new PostCard("Belgium", "Europe");
        PostCard france3 = new PostCard("France", "Europe");
        yourPostCardList.add(belgium);
        yourPostCardList.add(france);
        yourPostCardList.add(japan);
        yourPostCardList.add(rdc);
        yourPostCardList.add(southKorea);
        yourPostCardList.add(belgium2);
        yourPostCardList.add(southAfrica);
        yourPostCardList.add(france2);
        yourPostCardList.add(belgium3);
        yourPostCardList.add(usa);
        yourPostCardList.add(canada);
        yourPostCardList.add(peru);
        yourPostCardList.add(samoa);
        yourPostCardList.add(belgium4);
        yourPostCardList.add(france3);

        // Postcards from your friends
        PostCard northKorea = new PostCard("North Korea", "Asia");
        PostCard usa2 = new PostCard("United States of America", "North America");
        PostCard botswana = new PostCard("Botswana", "Africa");
        PostCard northKorea2 = new PostCard("North Korea", "Asia");
        yourFriendsPostCardList.add(northKorea);
        yourFriendsPostCardList.add(usa2);
        yourFriendsPostCardList.add(botswana);
        yourFriendsPostCardList.add(northKorea2);

        // Your friends
        Friend bobby = new Friend("Bobby", false, 3, 5);
        Friend melissa = new Friend("Melissa", false, 1, 6);
        Friend darla = new Friend("Darla", true, 14, 2);
        Friend bert = new Friend("Bert", false, 10, 4);
        Friend grandma = new Friend("Nana", true, 12, 7);
        Friend fester = new Friend("Fester", false, 1, 2);
        Friend anna = new Friend("Anna", false, 8, 4);

        // Operation 1: Trade with your best friend
        PostCard yourCard = yourPostCardList.get(0);
        PostCard friendCard = yourFriendsPostCardList.get(0);
        yourPostCardList.set(0, friendCard);
        yourFriendsPostCardList.set(0, yourCard);

        System.out.println("The result of trading cards with your best friend:");
        System.out.println("Your cards:");
        printPostCards(yourPostCardList);
        System.out.println("\nYour friend's cards:");
        printPostCards(yourFriendsPostCardList);

        // Operation 2: Sorting postcards by country
        yourPostCardList.sort(Comparator.comparing(PostCard::getCountry));

        System.out.println("\nPostcards after sorting by country:");
        yourPostCardList.forEach(card -> System.out.println(card));

        // Operation 3: Removing duplicates from the postcard list
        Map<PostCard, Integer> cardCountMap = removeDuplicates(yourPostCardList);
        System.out.println("\n Сount Total Duplicates: " + countTotalDuplicates(cardCountMap));

        // Display information about duplicates
        System.out.println("\nDuplicate information:");
        printDuplicateInfo(cardCountMap);

        // Operation 4: Gift cards to friends
        PriorityQueue<Friend> sortedFriends = new PriorityQueue<>(
                Comparator.comparing((Friend f) -> f.isFamily()).reversed()
                        .thenComparing(Friend::getFriendShipLevel)
                        .thenComparing(Friend::getYearsKnown)
        );

        sortedFriends.offer(bobby);
        sortedFriends.offer(melissa);
        sortedFriends.offer(darla);
        sortedFriends.offer(bert);
        sortedFriends.offer(grandma);
        sortedFriends.offer(fester);
        sortedFriends.offer(anna);

        System.out.println("\nFriends sorted by priority:");
        while (!sortedFriends.isEmpty()) {
            Friend friend = sortedFriends.poll();
            System.out.println(friend.getName() + " - Family: " + friend.isFamily() +
                    ", Friendship Level: " + friend.getFriendShipLevel() +
                    ", Years Known: " + friend.getYearsKnown());
        }
    }

    private static void printPostCards(List<PostCard> cards) {
        for (PostCard card : cards) {
            System.out.println(card);
        }
    }

    private static Map<PostCard, Integer> removeDuplicates(List<PostCard> cards) {
        Map<PostCard, Integer> cardCountMap = new HashMap<>();
        for (PostCard card : cards) {
            cardCountMap.put(card, cardCountMap.getOrDefault(card, 0) + 1);
        }
        return cardCountMap;
    }

    private static int countTotalDuplicates(Map<PostCard, Integer> cardCountMap) {
        int totalDuplicates = 0;
        for (int count : cardCountMap.values()) {
            totalDuplicates += Math.max(0, count - 1);
        }
        return totalDuplicates;
    }

    private static void printDuplicateInfo(Map<PostCard, Integer> cardCountMap) {
        for (Map.Entry<PostCard, Integer> entry : cardCountMap.entrySet()) {
            if (entry.getValue() > 1) {
                System.out.println("Postcard: " + entry.getKey() + ", Number of duplicates: " + (entry.getValue() - 1));
            }
        }
    }
}
